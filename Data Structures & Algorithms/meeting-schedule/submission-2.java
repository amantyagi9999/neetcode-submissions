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
        int start = intervals.get(0).start;
        int end = intervals.get(0).end;

        for(int i = 1 ; i<n ; i++){
            int currstart = intervals.get(i).start;
            int currend = intervals.get(i).end;
            if(currstart < end){
                end = Math.max(end, currend);
                return false;
            }
            else{
                start = currstart;
                end = currend;
            }
        }
        return true;
    }
}
