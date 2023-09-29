public class TransferMarket {

    abstract class FootballPlayers implements Comparable<FootballPlayers> {
        protected String name;
        protected String club;
        protected int games_count;

        public FootballPlayers(String name, String club, int games_count) {
            this.name = name;
            this.club = club;
            this.games_count = games_count;

        }


        public abstract int getGameStat();
        public String getName(){
            return name;
        }
        public String getClub(){
            return club;
        }
        public int getGamesNumber(){
            return games_count;
        }

        @Override
        public String toString(){
            return "Имя игрока: " + name + "    " + "Клуб: " + club;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            FootballPlayers player = (FootballPlayers) obj;
            return player.equals(player.name);

        }

        @Override
        public int compareTo(FootballPlayers player) {
            if (this.getGameStat() < player.getGameStat()) {
                return -1;
            }

            if (this.getGameStat() > player.getGameStat()) {
                return 1;
            }

            return 0;
        }


    }

     class Forwards extends FootballPlayers {
        private int goals;

         public Forwards(int goals,String name, String club,int games_count) {
             super(name, club, games_count);
             this.goals = goals;
         }


         @Override
         public int getGameStat(){
            return (goals*games_count);
        }

        @Override
         public String toString(){
            return "Имя: " + name + " \n" + "Клуб: " + club + " \n" + "Голов: " + goals + " \n";
        }

         @Override
         public boolean equals(Object obj) {
             if (this == obj) {
                 return true;
             }

             if (obj == null || getClass() != obj.getClass()) {
                 return false;
             }

             if (!super.equals(obj)) {
                 return false;
             }

             Forwards forward = (Forwards) obj;
             return goals == forward.goals;
         }

    }

    class Defenders extends FootballPlayers {
        private int interceptions;

        public Defenders(int interceptions,String name, String club, int games_count) {
            super(name, club, games_count);
            this.interceptions = interceptions;
        }


        @Override
        public int getGameStat(){
            return (interceptions*games_count);
        }

        @Override
        public String toString(){
            return "Имя: " + name + " \n" + "Клуб: " + club + " \n" + "Перехватов: " + interceptions + " \n";
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }

            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            if (!super.equals(obj)) {
                return false;
            }

            Defenders defender = (Defenders) obj;
            return interceptions == defender.interceptions;
        }

    }
}

