 public static class CoinToss {

        public String tossACoin() {
            //Random utility object
            Random rand = new Random();
            /*
            Math.abs returns an absolute value, and the random method would return either
            positive or negative value
            */
            int toss = Math.abs(rand.nextInt()) % 2;
            // if number if divisible by 2 and equals to 0, return heads
            if (toss == 0) {
                return "HEADS";
                // else if a negative number, return tails
            } else {
                return "TAILS";
            }
        }
    }