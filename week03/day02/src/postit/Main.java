package postit;

/* Create a PostIt class that has
a backgroundColor
a text on it
a textColor
Create a few example post-it objects:
an orange with blue text: "Idea 1"
a pink with black text: "Awesome"
a yellow with green text: "Superb!" */

public class Main {
    public static void main(String[] args) {

        PostIt post1 = new PostIt("orange", "Idea 1", "blue");
        PostIt post2 = new PostIt("pink", "Awesome", "black");
        PostIt post3 = new PostIt("yellow", "Superb", "green");

    }
}
