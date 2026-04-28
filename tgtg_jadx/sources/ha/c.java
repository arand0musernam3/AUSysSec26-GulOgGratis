package ha;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface c extends AutoCloseable {
    void C(int i11, String str);

    default boolean E() {
        return getLong(0) != 0;
    }

    String W(int i11);

    void f(int i11, double d3);

    byte[] getBlob(int i11);

    int getColumnCount();

    String getColumnName(int i11);

    double getDouble(int i11);

    long getLong(int i11);

    boolean isNull(int i11);

    void j(int i11, long j9);

    void k(int i11, byte[] bArr);

    void m(int i11);

    void n();

    boolean q0();

    void reset();
}
