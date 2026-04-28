package bp;

import com.app.tgtg.R;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f6551b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6552c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6553a;

    public /* synthetic */ a(int i11) {
        this.f6553a = i11;
    }

    public final String a(m3.n nVar, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        String strJ = "";
        switch (this.f6553a) {
            case 0:
                m3.s sVar = (m3.s) nVar;
                sVar.a0(628157251);
                if (i11 == 1) {
                    i12 = -1931267375;
                    i13 = R.string.rating_label_horrible;
                } else if (i11 == 2) {
                    i12 = -1931265332;
                    i13 = R.string.rating_label_bad;
                } else if (i11 == 3) {
                    i12 = -1931263444;
                    i13 = R.string.rating_label_meh;
                } else if (i11 == 4) {
                    i12 = -1931261555;
                    i13 = R.string.rating_label_good;
                } else if (i11 != 5) {
                    sVar.a0(260557691);
                    sVar.q(false);
                    sVar.q(false);
                } else {
                    i12 = -1931259632;
                    i13 = R.string.rating_label_awesome;
                }
                strJ = b3.i.j(i12, i13, sVar, sVar, false);
                sVar.q(false);
                break;
            default:
                m3.s sVar2 = (m3.s) nVar;
                sVar2.a0(-62547767);
                if (i11 == 1) {
                    i14 = 21141208;
                    i15 = R.string.rating_label_japan_bad;
                } else if (i11 == 2) {
                    i14 = 21143289;
                    i15 = R.string.rating_label_japan_okay;
                } else if (i11 == 3) {
                    i14 = 21145401;
                    i15 = R.string.rating_label_japan_good;
                } else if (i11 == 4) {
                    i14 = 21147514;
                    i15 = R.string.rating_label_japan_great;
                } else if (i11 != 5) {
                    sVar2.a0(655709365);
                    sVar2.q(false);
                    sVar2.q(false);
                } else {
                    i14 = 21149660;
                    i15 = R.string.rating_label_japan_amazing;
                }
                strJ = b3.i.j(i14, i15, sVar2, sVar2, false);
                sVar2.q(false);
                break;
        }
        return strJ;
    }
}
