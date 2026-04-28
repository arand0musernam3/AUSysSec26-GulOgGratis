package t1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public interface x1 {
    boolean a();

    long b(o oVar, o oVar2, o oVar3);

    o e(long j9, o oVar, o oVar2, o oVar3);

    default o k(o oVar, o oVar2, o oVar3) {
        return m(b(oVar, oVar2, oVar3), oVar, oVar2, oVar3);
    }

    o m(long j9, o oVar, o oVar2, o oVar3);
}
