package ex06;

// 흠. 그냥 이상한 점 찾는 문제라 그런지 코드를.. 흠. 모르겠다! 엣헴!

public class Chatting {
	void startChat(String chatId) {
		
		/*
		String nickName = null;
		nickName = chatId;
		*/
		final String nickName = chatId;
		
		Chat chat = new Chat() {
			@Override
			public void start() {
				int flagCount = 3;
				while(flagCount > 0) {
					flagCount -= 1;
					String inputData = "Hello";
					String message = "[" + nickName + "] " + inputData;
					sendMessage(message);
				}
			}
			
			@Override
			public void sendMessage(String message) {
				System.out.println(message);
			}
			
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
