package y00;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r2 implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ r2 f45112b = new r2(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45113a;

    public /* synthetic */ r2(int i11) {
        this.f45113a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f45113a) {
            case 0:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
            default:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
        }
    }
}
