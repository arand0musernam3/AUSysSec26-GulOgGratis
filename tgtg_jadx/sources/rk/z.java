package rk;

import com.app.tgtg.model.remote.specialrewards.response.SpecialRewardsResponse;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.iana.AEADAlgorithm;
import t1.r0;
import t1.t1;
import t1.y0;
import zendesk.ui.android.conversation.quickreply.QuickReplyOptionRendering;
import zendesk.ui.android.conversation.quickreply.QuickReplyOptionView;
import zendesk.ui.android.conversation.quickreply.QuickReplyRendering;
import zendesk.ui.android.conversation.quickreply.QuickReplyView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38126a;

    public /* synthetic */ z(int i11) {
        this.f38126a = i11;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, u70.j] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38126a) {
            case 0:
                return Integer.valueOf(((Integer) obj).intValue() / 2);
            case 1:
                return SpecialRewardsResponse.json$lambda$0((n90.h) obj);
            case 2:
                j5.b0 b0Var = (j5.b0) obj;
                b0Var.getClass();
                j5.z.b(b0Var);
                return Unit.f26487a;
            case 3:
                j5.b0 b0Var2 = (j5.b0) obj;
                b0Var2.getClass();
                j5.z.b(b0Var2);
                return Unit.f26487a;
            case 4:
                return QuickReplyOptionView.render$lambda$3$lambda$2$lambda$1((QuickReplyOptionRendering) obj);
            case 5:
                return QuickReplyOptionView.onRestoreInstanceState$lambda$6((QuickReplyOptionRendering) obj);
            case 6:
                return QuickReplyOptionView._init_$lambda$0((QuickReplyOptionRendering) obj);
            case 7:
                return QuickReplyView._init_$lambda$0((QuickReplyRendering) obj);
            case 8:
                Pair pair = (Pair) obj;
                pair.getClass();
                return pair.f26485a;
            case 9:
                ((cv.i) obj).getClass();
                return Unit.f26487a;
            case 10:
                return Unit.f26487a;
            case 11:
                y0 y0Var = (y0) obj;
                long j9 = y0Var.f39610g;
                ((z3.x) t1.f39574b.getValue()).d(y0Var, t1.f39573a, y0Var.f39611h);
                long j11 = y0Var.f39610g;
                if (j9 != j11) {
                    r0 r0Var = y0Var.f39617o;
                    if (r0Var != null) {
                        if (r0Var.f39554a > j11) {
                            y0Var.w();
                        } else {
                            r0Var.f39560g = j11;
                            if (r0Var.f39555b == null) {
                                r0Var.f39561h = j80.c.c((1.0d - ((double) r0Var.f39558e.a(0))) * y0Var.f39610g);
                            }
                        }
                    } else if (j11 != 0) {
                        y0Var.z();
                    }
                }
                return Unit.f26487a;
            case 12:
                ((Function0) obj).invoke();
                return Unit.f26487a;
            case 13:
                return new t1.k(((Float) obj).floatValue());
            case 14:
                return new t1.k(((Integer) obj).intValue());
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                return Integer.valueOf((int) ((t1.k) obj).f39470a);
            case 16:
                return new t1.k(((z5.f) obj).f47277a);
            case 17:
                return new z5.f(((t1.k) obj).f39470a);
            case 18:
                z5.g gVar = (z5.g) obj;
                return new t1.l(Float.intBitsToFloat((int) (gVar.f47278a >> 32)), Float.intBitsToFloat((int) (gVar.f47278a & 4294967295L)));
            case 19:
                t1.l lVar = (t1.l) obj;
                return new z5.g((((long) Float.floatToRawIntBits(lVar.f39482a)) << 32) | (((long) Float.floatToRawIntBits(lVar.f39483b)) & 4294967295L));
            case 20:
                h4.e eVar = (h4.e) obj;
                return new t1.l(Float.intBitsToFloat((int) (eVar.f21392a >> 32)), Float.intBitsToFloat((int) (eVar.f21392a & 4294967295L)));
            case 21:
                t1.l lVar2 = (t1.l) obj;
                return new h4.e((((long) Float.floatToRawIntBits(lVar2.f39482a)) << 32) | (((long) Float.floatToRawIntBits(lVar2.f39483b)) & 4294967295L));
            case 22:
                h4.b bVar = (h4.b) obj;
                return new t1.l(Float.intBitsToFloat((int) (bVar.f21378a >> 32)), Float.intBitsToFloat((int) (bVar.f21378a & 4294967295L)));
            case 23:
                t1.l lVar3 = (t1.l) obj;
                return new h4.b((((long) Float.floatToRawIntBits(lVar3.f39482a)) << 32) | (((long) Float.floatToRawIntBits(lVar3.f39483b)) & 4294967295L));
            case 24:
                long j12 = ((z5.j) obj).f47280a;
                return new t1.l((int) (j12 >> 32), (int) (j12 & 4294967295L));
            case 25:
                t1.l lVar4 = (t1.l) obj;
                return new z5.j((((long) Math.round(lVar4.f39482a)) << 32) | (((long) Math.round(lVar4.f39483b)) & 4294967295L));
            case 26:
                long j13 = ((z5.l) obj).f47286a;
                return new t1.l((int) (j13 >> 32), (int) (j13 & 4294967295L));
            case 27:
                t1.l lVar5 = (t1.l) obj;
                int iRound = Math.round(lVar5.f39482a);
                if (iRound < 0) {
                    iRound = 0;
                }
                int iRound2 = Math.round(lVar5.f39483b);
                return new z5.l((((long) (iRound2 >= 0 ? iRound2 : 0)) & 4294967295L) | (((long) iRound) << 32));
            case 28:
                h4.c cVar = (h4.c) obj;
                return new t1.n(cVar.f21380a, cVar.f21381b, cVar.f21382c, cVar.f21383d);
            default:
                t1.n nVar = (t1.n) obj;
                return new h4.c(nVar.f39496a, nVar.f39497b, nVar.f39498c, nVar.f39499d);
        }
    }
}
