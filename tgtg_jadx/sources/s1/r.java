package s1;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import m3.c3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f38667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f38668c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(Function1 function1, s sVar, int i11) {
        super(1);
        this.f38666a = i11;
        this.f38667b = function1;
        this.f38668c = sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f38666a) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                s sVar = this.f38668c;
                long j9 = iIntValue;
                return (Integer) this.f38667b.invoke(Integer.valueOf(((int) (s.e(sVar) >> 32)) - ((int) (s.d(sVar, (j9 & 4294967295L) | (j9 << 32), s.e(sVar)) >> 32))));
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                long j11 = iIntValue2;
                long j12 = (j11 & 4294967295L) | (j11 << 32);
                s sVar2 = this.f38668c;
                return (Integer) this.f38667b.invoke(Integer.valueOf((-((int) (s.d(sVar2, j12, s.e(sVar2)) >> 32))) - iIntValue2));
            case 2:
                int iIntValue3 = ((Number) obj).intValue();
                s sVar3 = this.f38668c;
                long j13 = iIntValue3;
                return (Integer) this.f38667b.invoke(Integer.valueOf(((int) (s.e(sVar3) & 4294967295L)) - ((int) (s.d(sVar3, (j13 & 4294967295L) | (j13 << 32), s.e(sVar3)) & 4294967295L))));
            case 3:
                int iIntValue4 = ((Number) obj).intValue();
                long j14 = iIntValue4;
                long j15 = (j14 & 4294967295L) | (j14 << 32);
                s sVar4 = this.f38668c;
                return (Integer) this.f38667b.invoke(Integer.valueOf((-((int) (s.d(sVar4, j15, s.e(sVar4)) & 4294967295L))) - iIntValue4));
            case 4:
                int iIntValue5 = ((Number) obj).intValue();
                s sVar5 = this.f38668c;
                c3 c3Var = (c3) sVar5.f38677e.d(sVar5.f38673a.f39540d.getValue());
                long j16 = c3Var != null ? ((z5.l) c3Var.getValue()).f47286a : 0L;
                long j17 = iIntValue5;
                return (Integer) this.f38667b.invoke(Integer.valueOf((-((int) (sVar5.f38674b.a((j17 << 32) | (j17 & 4294967295L), j16, z5.m.Ltr) >> 32))) - iIntValue5));
            case 5:
                int iIntValue6 = ((Number) obj).intValue();
                s sVar6 = this.f38668c;
                c3 c3Var2 = (c3) sVar6.f38677e.d(sVar6.f38673a.f39540d.getValue());
                long j18 = c3Var2 != null ? ((z5.l) c3Var2.getValue()).f47286a : 0L;
                long j19 = iIntValue6;
                return (Integer) this.f38667b.invoke(Integer.valueOf((-((int) (sVar6.f38674b.a((j19 << 32) | (j19 & 4294967295L), j18, z5.m.Ltr) >> 32))) + ((int) (j18 >> 32))));
            case 6:
                int iIntValue7 = ((Number) obj).intValue();
                s sVar7 = this.f38668c;
                c3 c3Var3 = (c3) sVar7.f38677e.d(sVar7.f38673a.f39540d.getValue());
                long j21 = c3Var3 != null ? ((z5.l) c3Var3.getValue()).f47286a : 0L;
                long j22 = iIntValue7;
                return (Integer) this.f38667b.invoke(Integer.valueOf((-((int) (sVar7.f38674b.a((j22 << 32) | (j22 & 4294967295L), j21, z5.m.Ltr) & 4294967295L))) - iIntValue7));
            default:
                int iIntValue8 = ((Number) obj).intValue();
                s sVar8 = this.f38668c;
                c3 c3Var4 = (c3) sVar8.f38677e.d(sVar8.f38673a.f39540d.getValue());
                long j23 = c3Var4 != null ? ((z5.l) c3Var4.getValue()).f47286a : 0L;
                long j24 = iIntValue8;
                return (Integer) this.f38667b.invoke(Integer.valueOf((-((int) (sVar8.f38674b.a((j24 << 32) | (j24 & 4294967295L), j23, z5.m.Ltr) & 4294967295L))) + ((int) (j23 & 4294967295L))));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(s sVar, Function1 function1, int i11) {
        super(1);
        this.f38666a = i11;
        this.f38668c = sVar;
        this.f38667b = function1;
    }
}
