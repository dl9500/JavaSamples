public boolean scoresIncreasing(int[] scores) {
  int i;
  int prev=scores[0];
  for(i=1; i<=scores.length-1; i++) {
    if(scores[i]<prev) {
      return false;
    } else {
      prev=scores[i];
    }
  }
  return true;
}
