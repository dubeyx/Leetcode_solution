class ATM {
    
    TreeMap<Long, Long> map;
    int currentAmount;
    long[] bankNotes = new long[]{20, 50, 100, 200, 500};
    public ATM() {
        map = new TreeMap<>(Collections.reverseOrder());
        for(long i : bankNotes) map.put(i, 0L);
    }
    
    public void deposit(int[] banknotesCount) {
        for(int i = 0; i < banknotesCount.length; i++){
            map.put(bankNotes[i], map.get(bankNotes[i]) + banknotesCount[i]);
        }
       // System.out.println(map);
    }
    
    public int[] withdraw(int amount) {
        long[] ans = new long[]{0,0,0,0,0};
        int index = 4;
        this.currentAmount = amount;
        while(amount > 0 && index >= 0){
            
            long denomination = bankNotes[index];
            long requiredNotesOfDenomination = amount / denomination;
            long numberOfNotesPresent = map.get(denomination);
            
            long ableToTake = Math.min(requiredNotesOfDenomination, numberOfNotesPresent);
            ans[index--] = ableToTake;
            amount -= ableToTake * denomination;
            
        }
        if(amount != 0) return new int[]{-1};
        for(int i = 0; i < bankNotes.length; i++){
            map.put(bankNotes[i], map.get(bankNotes[i]) - ans[i]);
        }
        return Arrays.stream(ans).mapToInt(i -> (int) i).toArray();
    }
}