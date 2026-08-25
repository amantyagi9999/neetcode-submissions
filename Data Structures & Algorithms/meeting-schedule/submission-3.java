/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
     public boolean canAttendMeetings(List<Interval> intervals) {
        intervals.sort((a, b) -> Integer.compare(a.start, b.start));
        int n = intervals.size();
        if(n == 0)
            return true;

        for(int i = 1 ; i<n ; i++){
            int end = intervals.get(i-1).end;
            int start = intervals.get(i).start;
            if(start < end){
                return false;
            }
        }
        return true;
    }
}
