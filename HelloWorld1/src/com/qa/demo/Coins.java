package com.qa.demo;

public class Coins {

	    public static void main(String[] args) {
	        getChangeAlt2(30.00, 33.58);
	    }
	        //		getChangeAlt(30.00, 39.50);
	        //		getChangeAlt(30.00, 33.53);
	        //      getChangeAlt(30.00, 33.55);
	        //      getChangeAlt(30.00, 36.59);   
	    public static String getChange(Double paid, Double cost) {
	        if (paid < cost) {
	            return "Not paid enough";
	        }
	        String change = getChange(paid - cost);
	        return change;
	    }
	    // with stringbuilder    public static String getChange(Double num) {
	        StringBuilder sb = new StringBuilder();
	        int twentys = 0;
	        int tens = 0;
	        int fives = 0;
	        int ones = 0;
	        int fiftyPs = 0;
	        int twentyPs = 0;
	        int tenPs = 0;
	        int fivePs = 0;
	        int twoPs = 0;
	        int onePs = 0;
	   
	        if (num >= 20) {
	            twentys = (int) (num / 20);
	            num -= 20 * twentys;
	            sb.append(twentys + " ?20 notes\n");
	        }
	        if (num >= 10) {
	            tens = (int) (num / 10);
	            num -= 10 * tens;
	            sb.append(tens + " ?10 notes\n");
	        }
	        if (num >= 5) {
	            fives = (int) (num / 5);
	            num -= 5 * fives;
	            sb.append(fives + " ?5 notes\n");
	        }
	        if (num >= 1) {
	            ones = (int) (num / 1);
	            num -= ones;
	            sb.append(ones + " ?1 coins\n");
	        }
	        if (num >= 0.5) {
	            fiftyPs = (int) (num / 0.5);
	            num -= 0.5 * fiftyPs;
	            sb.append(fiftyPs + " ?0.50 coins\n");
	        }
	        if (num >= 0.2) {
	            twentyPs = (int) (num / 0.2);
	            num -= 0.2 * twentyPs;
	            sb.append(twentyPs + " ?0.20 coins\n");
	        }
	        if (num >= 0.1) {
	            tenPs = (int) (num / 0.1);
	            num -= 0.1 * tenPs;
	            sb.append(tenPs + " ?0.10 coins\n");
	        }
	        if (num >= 0.05) {
	            fivePs = (int) (num / 0.05);
	            num -= 0.05 * fivePs;
	            sb.append(fivePs + " ?0.05 coins\n");
	        }
	        if (num >= 0.02) {
	            twoPs = (int) (num / 0.02);
	            num -= 0.02 * twoPs;
	            sb.append(twoPs + " ?0.02 coins\n");
	        }
	        if (num >= 0.009) {
	            onePs = (int) Math.round((num / 0.01));
	            num -= 0.01 * onePs;
	            sb.append(onePs + " ?0.01 coins\n");
	        }
	        return sb.toString();
	    }
	    // without stringbuilder, with loops    public static void getChangeAlt(Double cost, Double amount) {
	        int twentyNotes = 0;
	        int tenNotes = 0;
	        int fiveNotes = 0;
	        int twoPoundCoins = 0;
	        int onePoundCoins = 0;
	        int fiftyCoins = 0;
	        int twentyCoins = 0;
	        int tenCoins = 0;
	        int fiveCoins = 0;
	        int twoCoins = 0;
	        int oneCoins = 0;
	        double payback = amount - cost;
	        System.out.println("Change expected: ?" + payback);
	        // twenty pounds        while (payback >= 20) {
	            payback -= 20;
	            twentyNotes++;
	        }
	        System.out.println(twentyNotes + ": ?20 notes");
	        // ten pounds        while (payback >= 10) {
	            payback -= 10; // payback = payback - 10;            tenNotes++;
	        }
	        System.out.println(tenNotes + ": ?10 notes");
	        // 5 pounds        while (payback >= 5) {
	            payback -= 5;
	            fiveNotes++;
	        }
	        System.out.println(fiveNotes + ": ?5 notes");
	        // 2 pounds        while (payback >= 2) {
	            payback -= 2;
	            twoPoundCoins++;
	        }
	        System.out.println(twoPoundCoins + ": ?2 coins");
	        // 1 pounds        while (payback >= 1) {
	            payback -= 1;
	            onePoundCoins++;
	        }
	        System.out.println(onePoundCoins + ": ?1 coins");
	        // 50p coins        while (payback >= 0.5) {
	            payback -= 0.5;
	            fiftyCoins++;
	        }
	        System.out.println(fiftyCoins + ": 50p coins");
	        // 20p coins        while (payback >= 0.2) {
	            payback -= 0.2;
	            twentyCoins++;
	        }
	        System.out.println(twentyCoins + ": 20p coins");
	        // 10p coins        while (payback >= 0.1) {
	            payback -= 0.1;
	            tenCoins++;
	        }
	        System.out.println(tenCoins + ": 10p coins");
	        // 5p coins        while (payback >= 0.049) {
	            // use 0.049 instead of 0.05 to overcome rounding error            payback -= 0.049;
	            fiveCoins++;
	        }
	        System.out.println(fiveCoins + ": 5p coins");
	        // 2p coins        while (payback >= 0.019) {
	            // use 0.019 instead of 0.02 to overcome rounding error            payback -= 0.019;
	            twoCoins++;
	        }
	        System.out.println(twoCoins + ": 2p coins");
	        // 1p coins        while (payback >= 0.009) {
	            // use 0.009 instead of 0.01 to overcome rounding error            payback -= 0.009;
	            oneCoins++;
	        }
	        System.out.println(oneCoins + ": 1p coins");
	    }
	    
	    
	    public static void getChangeAlt2(Double cost, Double amount) {
	        int twentyNotes = 0;
	        int tenNotes = 0;
	        int fiveNotes = 0;
	        int twoPoundCoins = 0;
	        int onePoundCoins = 0;
	        int fiftyCoins = 0;
	        int twentyCoins = 0;
	        int tenCoins = 0;
	        int fiveCoins = 0;
	        int twoCoins = 0;
	        int oneCoins = 0;
	        double payback = amount - cost;
	        System.out.println("Change expected: ?" + payback);
	        // twenty pounds        while (payback >= 0.009) {
	            if (payback >= 20) {
	                payback -= 20;
	                twentyNotes++;
	            } else if (payback >= 10) {
	                payback -= 10; // payback = payback - 10;                tenNotes++;
	            } else if (payback >= 5) {
	                payback -= 5;
	                fiveNotes++;
	            } else if (payback >= 2) {
	                payback -= 2;
	                twoPoundCoins++;
	            } else if (payback >= 1) {
	                payback -= 1;
	                onePoundCoins++;
	            } else if (payback >= 0.5) {
	                payback -= 0.5;
	                fiftyCoins++;
	            } else if (payback >= 0.2) {
	                payback -= 0.2;
	                twentyCoins++;
	            } else if (payback >= 0.1) {
	                payback -= 0.1;
	                tenCoins++;
	            } else if (payback >= 0.049) {
	                // use 0.049 instead of 0.05 to overcome rounding error                payback -= 0.049;
	                fiveCoins++;
	            } else if (payback >= 0.019) {
	                // use 0.019 instead of 0.02 to overcome rounding error                payback -= 0.019;
	                twoCoins++;
	            } else if (payback >= 0.009) {
	                // use 0.009 instead of 0.01 to overcome rounding error                payback -= 0.009;
	                oneCoins++;
	            }
	        
	        System.out.println(twentyNotes + ": ?20 notes");
	        System.out.println(tenNotes + ": ?10 notes");
	        System.out.println(fiveNotes + ": ?5 notes");
	        System.out.println(twoPoundCoins + ": ?2 coins");
	        System.out.println(onePoundCoins + ": ?1 coins");
	        System.out.println(fiftyCoins + ": 50p coins");
	        System.out.println(twentyCoins + ": 20p coins");
	        System.out.println(tenCoins + ": 10p coins");
	        System.out.println(fiveCoins + ": 5p coins");
	        System.out.println(twoCoins + ": 2p coins");
	        System.out.println(oneCoins + ": 1p coins");
	    }
	    