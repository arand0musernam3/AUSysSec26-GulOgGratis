package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j3 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w6 f18879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ v80.b0 f18880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function0 f18881d;

    public /* synthetic */ j3(w6 w6Var, Function0 function0, v80.b0 b0Var) {
        this.f18878a = 0;
        this.f18879b = w6Var;
        this.f18881d = function0;
        this.f18880c = b0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18878a) {
            case 0:
                w6 w6Var = this.f18879b;
                int i11 = u3.$EnumSwitchMapping$0[w6Var.d().ordinal()];
                v80.b0 b0Var = this.f18880c;
                x70.c cVar = null;
                if (i11 == 2) {
                    v80.f0.B(b0Var, null, null, new q3(w6Var, cVar, 4), 3);
                } else if (i11 != 3) {
                    v80.f0.B(b0Var, null, null, new q3(w6Var, cVar, 5), 3);
                } else {
                    this.f18881d.invoke();
                }
                break;
            case 1:
                final w6 w6Var2 = this.f18879b;
                if (((Boolean) w6Var2.f19705d.invoke(x6.Hidden)).booleanValue()) {
                    v80.b2 b2VarB = v80.f0.B(this.f18880c, null, null, new q3(w6Var2, null, 3), 3);
                    final int i12 = 0;
                    final Function0 function0 = this.f18881d;
                    b2VarB.J(new Function1() { // from class: g3.o3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i12) {
                                case 0:
                                    if (!w6Var2.f()) {
                                        function0.invoke();
                                    }
                                    break;
                                default:
                                    if (!w6Var2.f()) {
                                        function0.invoke();
                                    }
                                    break;
                            }
                            return Unit.f26487a;
                        }
                    });
                }
                break;
            case 2:
                final w6 w6Var3 = this.f18879b;
                v80.b2 b2VarB2 = v80.f0.B(this.f18880c, null, null, new q3(w6Var3, null, 9), 3);
                final int i13 = 1;
                final Function0 function02 = this.f18881d;
                b2VarB2.J(new Function1() { // from class: g3.o3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        switch (i13) {
                            case 0:
                                if (!w6Var3.f()) {
                                    function02.invoke();
                                }
                                break;
                            default:
                                if (!w6Var3.f()) {
                                    function02.invoke();
                                }
                                break;
                        }
                        return Unit.f26487a;
                    }
                });
                break;
            case 3:
                v80.f0.B(this.f18880c, null, null, new oi.b(this.f18879b, this.f18881d, null, 0), 3);
                break;
            case 4:
                v80.f0.B(this.f18880c, null, null, new oi.b(this.f18879b, this.f18881d, null, 1), 3);
                break;
            case 5:
                v80.f0.B(this.f18880c, null, null, new oi.b(this.f18879b, this.f18881d, null, 2), 3);
                break;
            case 6:
                v80.f0.B(this.f18880c, null, null, new oi.b(this.f18879b, this.f18881d, null, 3), 3);
                break;
            case 7:
                v80.f0.B(this.f18880c, null, null, new oi.b(this.f18879b, this.f18881d, null, 4), 3);
                break;
            case 8:
                v80.f0.B(this.f18880c, null, null, new oi.b(this.f18879b, this.f18881d, null, 6), 3);
                break;
            case 9:
                v80.f0.B(this.f18880c, null, null, new oi.b(this.f18879b, this.f18881d, null, 7), 3);
                break;
            default:
                v80.f0.B(this.f18880c, null, null, new oi.b(this.f18879b, this.f18881d, null, 8), 3);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ j3(w6 w6Var, v80.b0 b0Var, Function0 function0) {
        this.f18878a = 1;
        this.f18879b = w6Var;
        this.f18880c = b0Var;
        this.f18881d = function0;
    }

    public /* synthetic */ j3(v80.b0 b0Var, w6 w6Var, Function0 function0, int i11) {
        this.f18878a = i11;
        this.f18880c = b0Var;
        this.f18879b = w6Var;
        this.f18881d = function0;
    }
}
