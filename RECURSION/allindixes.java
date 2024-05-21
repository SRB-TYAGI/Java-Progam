public class allindixes {
    public static int[] allIndexes(int input[], int x, int startIndex) {
    if(startIndex == input.length) {
    int output[] = new int[0];
    return output;
    }
    int smallOutput[] = allIndexes(input, x, startIndex + 1);
    if(input[startIndex] == x) {
    int output[] = new int[smallOutput.length + 1];
    output[0] = startIndex;
    for(int i = 0; i < smallOutput.length; i++) {
    output[i + 1] = smallOutput[i];
    }
    return output;
    }
    else {
    return smallOutput;
    }
    }
    public static int[] allIndexes(int input[], int x) {
    return allIndexes(input, x, 0);
    }
}