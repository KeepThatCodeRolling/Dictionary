import java.util.Scanner;
public enum Dictionary {//Enume Data Total: 89, keywords: 23 --separated to make identify unique keywords no definitions
        AlphaNoun01 ("Alpha","noun", "The first letter of the Greek alphabet"),

        ArrowNoun01 ("Arrow","noun", "Here is one arrow: <IMG> -=>> </IMG>"),

        BandNoun01 ("Band","noun", "A group of instrumentalists playing music "),

        BookNoun01 ("Book","noun", " A set of pages."),
        BookNoun02 ("Book","noun", "A written work published in printed or electronic form."),
        BookVerb01 ("Book","verb", "To arrange for someone to have a seat on a plane."),
        BookVerb02 ("Book","verb", "To arrange something on a particular date"),

        CasketNoun01 ("Casket","noun" , "A coffin."),
        CasketNoun02 ("Casket","noun" , "A small chest or box."),

        carNoun01 ("Car","noun" , "An automobile."),

        DarkAdj01("Dark","adjective","Having very little or no light"),
        DarkAdj02("Dark","adjective","Radiating, admitting, or reflecting little light."),
        DarkVerb03("Dark","verb","To make dark;darken."),

        DistinctAdj01("Distinct", "adjective"," Familiar. Worked in Java."),
        DistinctAdj02("Distinct", "adjective"," Unique. No duplicates. Clearly different or of a different kind."),
        DistinctAdv01("Distinct", "adverb"," Uniquely. Written \"distinctly"),
        DistinctNoun01("Distinct", "noun"," A keyword in this assignment."),
        DistinctNoun02("Distinct", "noun"," A keyword in this assignment."),
        DistinctNoun03("Distinct", "noun"," A keyword in this assignment."),
        DistinctNoun04("Distinct", "noun"," An advanced search option."),
        DistinctNoun05("Distinct", "noun"," Distinct is a parameter in this assignment."),

        ExclusiveAdj01("Exclusive", "adjective", "Not admitting of something else."),
        ExclusiveAdj02("Exclusive", "adjective", "Limited to the object or objects designated."),
        ExclusiveNoun01("Exclusive", "noun", "An exclusive right or privilege"),

        FarmNoun01("Farm", "noun", "A fixed yearly amount payment of money or goods accepted in lieu of taxes owed."),
        FarmNoun02("Farm", "noun", "Land or water devoted to the raising of animals"),
        FarmVerb01("Farm", "verb", "To cultivate (land)."),

        GoneAdj01("Gone", "adjective", "Used up."),
        GoneAdj02("Gone", "adjective", "Weak and faint."),
        GoneVerb01("Gone", "verb", "Past participle of go."),

        HoleNoun01("Hole", "noun", "An opening through something"),
        HoleNoun02("Hole", "noun", "The excavated habitation of an animal;burrow."),
        HoleVerb01("Hole", "verb", "To bore(a tunnel, passage, etc)."),

        IceNoun01("Ice", "noun", "Frozen surface of a body of water"),
        IceNoun02("Ice", "noun", "Icing, as on a cake"),
        IceVerb01("Ice", "verb", "To cover with ice"),

        KickNoun01("Kick", "noun","The act of kicking; a blow or thrust with foot or feet."),
        KickNoun02("Kick", "noun","Thrill;pleasurable excitement"),
        KickVerb01("Kick", "verb","To recoil, as a firearm when fired."),

        LispNoun01("Lisp", "noun", "Any unconventional articulation of the sibilants"),
        LispNoun02("Lisp", "noun", "The act,habit or sound of lisping."),
        LispNoun03("Lisp", "verb", "To pronounce or speak with a lisp."),

        MachineNoun01("Machine", "noun", "An apparatus consisting of interrelated parts with separate functions"),
        MachineNoun02("Machine", "noun", "An automobile or airplane."),
        MachineVerb01("Machine", "verb", "To make,prepare,or finish with a machine or with machine tools."),

        NickNounb01("Nick", "noun","a small dent or wound."),
        NickVerb01("Nick", "verb","To cut through"),
        NickVerb02("Nick", "verb","To hit or injure slightly."),

        OldAdj01("Old","adjective","As if or appearing to be far advanced in years"),
        OldAdj02("Old","adjective","Having been aged for a specified time."),
        OldNoun01("Old","noun","Old or former time,often time long past."),

        PanNoun01("Pan","noun", "A drifting piece of flat,thin ice, as formed on a shore or bay."),
        PanVerb02("Pan","verb", "To cook or bake in a pan."),
        PanVerb01("Pan","verb", "To yield gold"),

        QuizNoun02("Quiz", "noun","A practical joke; a hoax."),
        QuizNoun01("Quiz", "noun","A questioning."),
        QuizVerb01("Quiz", "verb","To examine or test informally by questions."),

        RankNoun02("Rank", "noun","A row,line, or series of things or persons."),
        RankNoun01("Rank", "noun","A social or official position or standing, as int he armed forces."),
        RankVerb01("Rank", "verb","To be Senior the in rank"),

        ReverseAdj02("Reverse","adjective", "On back side."),
        ReverseAdj01("Reverse","adjective", "Opposite to usual or previous arrangement"),
        ReverseNoun07("Reverse","noun", "A dictionary program's parameter."),
        ReverseNoun06("Reverse","noun", "Change to opposite direction"),
        ReverseNoun05("Reverse","noun", "The opposite."),
        ReverseNoun01("Reverse","noun", "To be updated..."),
        ReverseNoun02("Reverse","noun", "To be updated..."),
        ReverseNoun03("Reverse","noun", "To be updated..."),
        ReverseNoun04("Reverse","noun", "To be updated..."),
        ReverseVerb06("Reverse","verb", "Change something to opposite"),
        ReverseVerb05("Reverse","verb", "Go back"),
        ReverseVerb04("Reverse","verb", "Revoke ruling."),
        ReverseVerb02("Reverse","verb", "To be updated..."),
        ReverseVerb03("Reverse","verb", "To be updated..."),
        ReverseVerb01("Reverse","verb", "Turn something inside out"),

        StickNoun01("Stick","noun", "A baton"),
        StickVerb02("Stick","verb", "To furnish(a plant,vine,etc.) with a stick or sticks in order to prop or support."),
        StickVerb01("Stick","verb", "To pierce or puncture with something pointed"),

        PlaceHolderAdj01("PlaceHolder", "adjective", " To be updated..."),
        PlaceHolderAdj02("PlaceHolder", "adjective", " To be updated..."),
        PlaceHolderAdv01("PlaceHolder", "adverb", " To be updated..."),
        PlaceHolderConj01("PlaceHolder", "conjunction", " To be updated..."),
        PlaceHolderInterj01("PlaceHolder", "interjection", " To be updated..."),
        PlaceHolderNoun01("PlaceHolder", "noun", " To be updated..."),
        PlaceHolderNoun02("PlaceHolder", "noun", " To be updated..."),
        PlaceHolderNoun03("PlaceHolder", "noun", " To be updated..."),
        PlaceHolderPreposition01("PlaceHolder", "preposition", " To be updated..."),
        PlaceHolderPronoun01("PlaceHolder", "pronoun", " To be updated..."),
        PlaceHolderVerb01("PlaceHolder", "verb", " To be updated...");

        //Variables used to access certain parts of enums data
        private String keyWord;
        private String partOfSpeech;
        private String definition;

        //Constructor
        private Dictionary(String keyWord, String partOfSpeech,String definition){
            this.keyWord = keyWord;
            this.partOfSpeech = partOfSpeech;
            this.definition = definition;
        }

        //Receives number of elements and not number of unique definitions
        public static int getNumOfDefinitions() {return(Dictionary.values().length);}

        //Gets number of only unique keywords
        public static int getNumOfKeyWords(){
                int interval = 1;
                //Makes sure I take into account for a case that there is zero data in enums
                //else if: compares before index and at index to and if different adds to interval by one
                if(Dictionary.values().length ==0)
                        return 0;
                else if(Dictionary.values().length > 1){
                        for (int i = 1; i < Dictionary.values().length; i++) {
                                if (!Dictionary.values()[i].keyWord.equals(Dictionary.values()[i-1].keyWord))
                                        interval = interval + 1;
                        }
                }
                return interval;
        }

        //Houses all search algorithms
        public static void search(int index, boolean reverse, boolean distinct, String userInput, String partOfSpeech) {
                if (index < 0) {
                        return;
                }

                if (distinct && reverse) {
                        reverseDistinctSearch(index, userInput, partOfSpeech);
                } else if (reverse) {
                        reverseSearch(index, userInput, partOfSpeech);
                } else if (distinct) {
                        distinctSearch(index, userInput, partOfSpeech);
                } else {
                        search(index - 1, false, false, userInput, partOfSpeech);
                        performSearch(index, userInput, partOfSpeech);
                }
        }

        private static void performSearch(int index, String userInput, String partOfSpeech) {
                if (matchesSearchCriteria(index, userInput, partOfSpeech)) {
                        printDefinition(index);
                }
        }

        //searches in reverse using recursive
        public static void reverseSearch(int index, String userInput, String partOfSpeech) {
                performSearch(index, userInput, partOfSpeech);
                search(index - 1, true, false, userInput, partOfSpeech);
        }

        // searches difference between at index and after index to ensure they are not the same when printed
        public static void distinctSearch(int index, String userInput, String partOfSpeech) {
                search(index - 1, false, true, userInput, partOfSpeech);

                if (matchesSearchCriteria(index, userInput, partOfSpeech)) {
                        if (index + 1 < Dictionary.values().length &&
                                !Dictionary.values()[index].definition.equals(Dictionary.values()[index + 1].definition)) {
                                printDefinition(index);
                        }
                }
        }

        //Mixes both searches, just adds more conditions that pertain distinct and reverse
        public static void reverseDistinctSearch(int index, String userInput, String partOfSpeech) {
                if (matchesSearchCriteria(index, userInput, partOfSpeech)) {
                        if (index == Dictionary.values().length - 1 ||
                                !Dictionary.values()[index].definition.equals(Dictionary.values()[index + 1].definition)) {
                                printDefinition(index);
                        }
                }
                search(index - 1, true, true, userInput, partOfSpeech);
        }

        //used everywhere to compare each by case, part of speech
        private static boolean matchesSearchCriteria(int index, String userInput, String partOfSpeech) {
                return userInput.equalsIgnoreCase(Dictionary.values()[index].keyWord) &&
                        (partOfSpeech == null || partOfSpeech.isEmpty() || partOfSpeech.equalsIgnoreCase(Dictionary.values()[index].partOfSpeech));
        }

        //Just Prints out information
        private static void printDefinition(int index) {
                System.out.println(Dictionary.values()[index].keyWord +
                        " [" + Dictionary.values()[index].partOfSpeech + "] : " +
                        Dictionary.values()[index].definition);
        }

        //!help command, tells user what to do
        public static void help() {
                System.out.print("PARAMETER HOW-TO, please enter:\n" +
                        "1. A search key -then 2. An optional part of speech -then\n" +
                        "3. An optional 'distinct' -then 4. An optional 'reverse'\n");
        }

        //This is where the program starts and takes interacts with the user by providing them information
        public static void getInputFromUser() {
                boolean quit = false;
                int searchNum = 1;
                Scanner input = new Scanner(System.in);

                System.out.println("! Loading data...\n! Loading completed...\n");
                System.out.println("===== DICTIONARY 340 JAVA =====\n----- Keywords: " + getNumOfKeyWords());
                System.out.println("----- Definitions: " + getNumOfDefinitions());

                while (!quit) {
                        System.out.print("Search [" + searchNum + "] : ");
                        String userInput = input.nextLine();
                        String[] parts = userInput.split(" ");
                        boolean distinct = false;
                        boolean reverse = false;
                        String keyword = "";
                        String partOfSpeech = "";


                        if (userInput.equals("!help")) {
                                System.out.println("|");
                                help();

                        } else if (userInput.equals("")) {
                                System.out.println("|");
                                System.out.print("Nothing");
                        }else if (userInput.equals("!q")){
                                System.out.print("-----THANK YOU-----");
                                return;
                        }
                        else {
                                System.out.println("|");
                                if (parts.length > 0) {
                                        keyword = parts[0];
                                }
                                if (parts.length > 1) {
                                        partOfSpeech = parts[1];

                                }
                                if (parts.length > 2) {
                                        distinct = parts[2].equalsIgnoreCase("y");
                                }
                                if (parts.length > 3) {
                                        reverse = parts[3].equalsIgnoreCase("y");
                                }

                                search(Dictionary.values().length - 1, reverse, distinct, keyword, partOfSpeech);
                        }

                        System.out.println("|");
                        searchNum++;
                }
        }
}
