package prac8;

public class Main {
    public static void main(String[] args) {
        YoutubeChanel youtubeChanel = new YoutubeChanel();
        YouTubeUser Alina = new YouTubeUser();
        YouTubeUser Masha = new YouTubeUser();
        YouTubeUser Eva = new YouTubeUser();

        youtubeChanel.addSubscriber(Alina);
        youtubeChanel.addSubscriber(Masha);
        youtubeChanel.addSubscriber(Eva);

        youtubeChanel.uploadVideo("Реализация паттерна Наблюдатель");

        System.out.println("\nРеализация паттерна Состояние\n");

        State stateA = new ConcreateStateA();
        Context context = new Context(stateA);
        context.doAction();
        context.doAction();

    }

}
