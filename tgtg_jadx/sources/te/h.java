package te;

import android.graphics.PointF;
import com.braze.Constants;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f40080a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a60.n f40081b = a60.n.b(Constants.BRAZE_PUSH_TITLE_KEY, "f", Constants.BRAZE_PUSH_SUMMARY_TEXT_KEY, "j", "tr", "lh", "ls", "fc", "sc", "sw", "of", "ps", "sz");

    @Override // te.f0
    public final Object f(ue.d dVar, float f11) {
        oe.b bVar = oe.b.CENTER;
        dVar.e();
        String strG = null;
        float fA = 0.0f;
        float fA2 = 0.0f;
        float fA3 = 0.0f;
        float fA4 = 0.0f;
        int iB = 0;
        int iA = 0;
        int iA2 = 0;
        boolean zU = true;
        String strG2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        while (dVar.t()) {
            switch (dVar.J(f40081b)) {
                case 0:
                    strG = dVar.G();
                    break;
                case 1:
                    strG2 = dVar.G();
                    break;
                case 2:
                    fA = (float) dVar.A();
                    break;
                case 3:
                    int iB2 = dVar.B();
                    oe.b bVar2 = oe.b.CENTER;
                    bVar = (iB2 <= bVar2.ordinal() && iB2 >= 0) ? oe.b.values()[iB2] : bVar2;
                    break;
                case 4:
                    iB = dVar.B();
                    break;
                case 5:
                    fA2 = (float) dVar.A();
                    break;
                case 6:
                    fA3 = (float) dVar.A();
                    break;
                case 7:
                    iA = o.a(dVar);
                    break;
                case 8:
                    iA2 = o.a(dVar);
                    break;
                case 9:
                    fA4 = (float) dVar.A();
                    break;
                case 10:
                    zU = dVar.u();
                    break;
                case 11:
                    dVar.a();
                    pointF = new PointF(((float) dVar.A()) * f11, ((float) dVar.A()) * f11);
                    dVar.g();
                    break;
                case 12:
                    dVar.a();
                    pointF2 = new PointF(((float) dVar.A()) * f11, ((float) dVar.A()) * f11);
                    dVar.g();
                    break;
                default:
                    dVar.L();
                    dVar.O();
                    break;
            }
        }
        dVar.p();
        oe.c cVar = new oe.c();
        cVar.f32452a = strG;
        cVar.f32453b = strG2;
        cVar.f32454c = fA;
        cVar.f32455d = bVar;
        cVar.f32456e = iB;
        cVar.f32457f = fA2;
        cVar.f32458g = fA3;
        cVar.f32459h = iA;
        cVar.f32460i = iA2;
        cVar.f32461j = fA4;
        cVar.f32462k = zU;
        cVar.l = pointF;
        cVar.f32463m = pointF2;
        return cVar;
    }
}
