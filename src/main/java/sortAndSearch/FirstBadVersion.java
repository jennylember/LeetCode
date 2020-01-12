package sortAndSearch;

public class FirstBadVersion {
    public int firstBadVersion(boolean[] versions, int n) {

        int left = 1;
        int right = n;
        int mid = 0;


        while(left < right) {
            mid = (left + right) / 2;
            if (isBadVersion(versions, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    public boolean isBadVersion(boolean[] versions, int n) {
        return versions[n];
    }
}
