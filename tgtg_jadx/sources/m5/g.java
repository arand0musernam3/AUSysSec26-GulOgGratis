package m5;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29534a;

    public /* synthetic */ g(int i11) {
        this.f29534a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f29534a) {
        }
        return w70.a.a(Integer.valueOf(((f) obj).f29530b), Integer.valueOf(((f) obj2).f29530b));
    }
}
