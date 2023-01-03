public class dkstraAlgo {
    
    private int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
          if (!visitedVertex[i] && distance[i] < minDistance) {
            minDistance = distance[i];
            minDistanceVertex = i;
          }
        }
        return minDistanceVertex;
      }
}
