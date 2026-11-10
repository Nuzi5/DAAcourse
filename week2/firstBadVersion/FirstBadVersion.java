public class FirstBadVersion {

    public int firstBadVersion(int n) {
        for (int version = 1; version <= n; version++) {
            if (isBadVersion(version)) {
                return version;
            }
        }
        return -1;
    }
}
