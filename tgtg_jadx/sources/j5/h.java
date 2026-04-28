package j5;

import java.util.Comparator;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f24625b = new h(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f24626c = new h(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h f24627d = new h(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24628a;

    public /* synthetic */ h(int i11) {
        this.f24628a = i11;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f24628a) {
            case 0:
                h4.c cVarH = ((t) obj).h();
                h4.c cVarH2 = ((t) obj2).h();
                int iCompare = Float.compare(cVarH.f21380a, cVarH2.f21380a);
                if (iCompare != 0) {
                    return iCompare;
                }
                int iCompare2 = Float.compare(cVarH.f21381b, cVarH2.f21381b);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                int iCompare3 = Float.compare(cVarH.f21383d, cVarH2.f21383d);
                return iCompare3 != 0 ? iCompare3 : Float.compare(cVarH.f21382c, cVarH2.f21382c);
            case 1:
                h4.c cVarH3 = ((t) obj).h();
                h4.c cVarH4 = ((t) obj2).h();
                int iCompare4 = Float.compare(cVarH4.f21382c, cVarH3.f21382c);
                if (iCompare4 != 0) {
                    return iCompare4;
                }
                int iCompare5 = Float.compare(cVarH3.f21381b, cVarH4.f21381b);
                if (iCompare5 != 0) {
                    return iCompare5;
                }
                int iCompare6 = Float.compare(cVarH3.f21383d, cVarH4.f21383d);
                return iCompare6 != 0 ? iCompare6 : Float.compare(cVarH4.f21380a, cVarH3.f21380a);
            default:
                Pair pair = (Pair) obj;
                Pair pair2 = (Pair) obj2;
                int iCompare7 = Float.compare(((h4.c) pair.f26485a).f21381b, ((h4.c) pair2.f26485a).f21381b);
                return iCompare7 != 0 ? iCompare7 : Float.compare(((h4.c) pair.f26485a).f21383d, ((h4.c) pair2.f26485a).f21383d);
        }
    }
}
