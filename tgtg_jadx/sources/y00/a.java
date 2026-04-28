package y00;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f44572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f44573c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f44574d;

    public /* synthetic */ a(a0 a0Var, String str, long j9, int i11) {
        this.f44571a = i11;
        this.f44572b = str;
        this.f44573c = j9;
        this.f44574d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44571a) {
            case 0:
                a0 a0Var = this.f44574d;
                a0Var.p();
                String str = this.f44572b;
                com.google.android.gms.common.internal.i0.e(str);
                q1.e eVar = a0Var.f44576d;
                boolean zIsEmpty = eVar.isEmpty();
                long j9 = this.f44573c;
                if (zIsEmpty) {
                    a0Var.f44577e = j9;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                } else if (eVar.f35782c < 100) {
                    eVar.put(str, 1);
                    a0Var.f44575c.put(str, Long.valueOf(j9));
                } else {
                    w0 w0Var = ((n1) a0Var.f21216b).f44987f;
                    n1.m(w0Var);
                    w0Var.f45263j.a("Too many ads visible");
                }
                break;
            default:
                a0 a0Var2 = this.f44574d;
                a0Var2.p();
                String str2 = this.f44572b;
                com.google.android.gms.common.internal.i0.e(str2);
                q1.e eVar2 = a0Var2.f44576d;
                Integer num2 = (Integer) eVar2.get(str2);
                n1 n1Var = (n1) a0Var2.f21216b;
                if (num2 == null) {
                    w0 w0Var2 = n1Var.f44987f;
                    n1.m(w0Var2);
                    w0Var2.f45260g.b(str2, "Call to endAdUnitExposure for unknown ad unit id");
                } else {
                    d3 d3Var = n1Var.l;
                    w0 w0Var3 = n1Var.f44987f;
                    n1.l(d3Var);
                    a3 a3VarT = d3Var.t(false);
                    int iIntValue = num2.intValue() - 1;
                    if (iIntValue != 0) {
                        eVar2.put(str2, Integer.valueOf(iIntValue));
                    } else {
                        eVar2.remove(str2);
                        q1.e eVar3 = a0Var2.f44575c;
                        Long l = (Long) eVar3.get(str2);
                        long j11 = this.f44573c;
                        if (l == null) {
                            n1.m(w0Var3);
                            w0Var3.f45260g.a("First ad unit exposure time was never set");
                        } else {
                            long jLongValue = j11 - l.longValue();
                            eVar3.remove(str2);
                            a0Var2.u(str2, jLongValue, a3VarT);
                        }
                        if (eVar2.isEmpty()) {
                            long j12 = a0Var2.f44577e;
                            if (j12 != 0) {
                                a0Var2.t(j11 - j12, a3VarT);
                                a0Var2.f44577e = 0L;
                            } else {
                                n1.m(w0Var3);
                                w0Var3.f45260g.a("First ad exposure time was never set");
                            }
                        }
                    }
                }
                break;
        }
    }
}
