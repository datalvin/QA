public class Token {
		String value;
		public Token() {
			this.value = " ";
		}
		public void setType(String type) {
			this.value = type;
		}
		public String getType() {
			return value;
		}
	}