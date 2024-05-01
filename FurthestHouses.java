public class FurthestHouses {
    public int maxDistance(int[] colors) {
        int i = 0;
        int j = colors.length-1;

        while(colors[i]==colors[j]){
            j--;
        }
        int out = j-i;
        j = colors.length-1;
        while(colors[i]==colors[j]){
            i++;
        }

        return Math.max(out, j-i);
    }
}
