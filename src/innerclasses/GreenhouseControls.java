package innerclasses;

public class GreenhouseControls extends Controller {
	private boolean light = false;
	
	public class LightOn extends Event {

		public LightOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = true;
		}
		
		public String toString() {
			return "Light is on";
		}
	}
	
	public class LightOff extends Event {

		public LightOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			light = false;
		}
		
		public String toString() {
			return "Light is off";
		}
	}
	
	private boolean water = false;
	
	public class WaterOn extends Event {

		public WaterOn(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = true;
		}
		
		@Override
		public String toString() {
			return "Greenhouse water is on";
		}
	}
	
	public class WaterOff extends Event {

		public WaterOff(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			water = false;
		}
		
		@Override
		public String toString() {
			return "Greenhouse water is off";
		}
	}
	
	//ºãÎÂÆ÷
	private String thermostat = "Day";
	
	public class ThermostratNight extends Event {

		public ThermostratNight(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat = "Night";
		}
		
		@Override
		public String toString() {
			return "Thermostrat on night setting";
		}
	}
	
	public class ThermostratDay extends Event {

		public ThermostratDay(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			thermostat = "Day";
		}
		
		@Override
		public String toString() {
			return "Thermostrat on day setting";
		}
	}
	
	public class Bell extends Event {

		public Bell(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}
		
		@Override
		public String toString() {
			return "Bing!";
		}
	}
	
	public class Restart extends Event {
		private Event[] eventList;
		
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for (Event e : eventList) {
				addEvent(e);
			}
		}

		@Override
		public void action() {
			for (Event e : eventList) {
				e.start();
				addEvent(e);
			}
			start();
			addEvent(this);
		}
		
		@Override
		public String toString() {
			return "Restarting system";
		}
	}
	
	//ÖÕÖ¹
	public static class Terminate extends Event {

		public Terminate(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			System.exit(0);
		}
		
		@Override
		public String toString() {
			return "Terminating";
		}
	}
}
