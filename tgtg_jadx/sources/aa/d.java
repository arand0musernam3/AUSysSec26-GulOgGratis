package aa;

import android.database.SQLException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import y80.e1;
import y80.m1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f1079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1080c;

    public /* synthetic */ d(Object obj, boolean z11, int i11) {
        this.f1078a = i11;
        this.f1080c = obj;
        this.f1079b = z11;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        e1 e1VarI;
        switch (this.f1078a) {
            case 0:
                h hVar = (h) this.f1080c;
                String str = this.f1079b ? "reader" : "writer";
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Timed out attempting to acquire a " + str + " connection.");
                sb2.append("\n\nWriter pool:\n");
                hVar.f1108b.d(sb2);
                sb2.append("Reader pool:");
                sb2.append('\n');
                hVar.f1107a.d(sb2);
                try {
                    z20.b.E(5, sb2.toString());
                    throw null;
                } catch (SQLException e5) {
                    int i11 = hVar.f1113g;
                    if (i11 == 1) {
                        throw e5;
                    }
                    if (i11 == 2) {
                        e5.printStackTrace();
                    }
                    return Unit.f26487a;
                }
            case 1:
                g4.v vVar = (g4.v) this.f1080c;
                if (this.f1079b) {
                    g4.v.a(vVar);
                }
                return Unit.f26487a;
            case 2:
                return com.braze.storage.b.b(this.f1080c, this.f1079b);
            case 3:
                e1 e1Var = (e1) this.f1080c;
                if (this.f1079b) {
                    e1Var.i(Unit.f26487a);
                }
                return Unit.f26487a;
            case 4:
                w2.b bVar = (w2.b) this.f1080c;
                if (this.f1079b && (e1VarI = bVar.i()) != null) {
                    ((m1) e1VarI).i(Unit.f26487a);
                }
                return Unit.f26487a;
            case 5:
                return com.braze.communication.dust.i.a(this.f1079b, (com.braze.communication.dust.i) this.f1080c);
            default:
                Function0 function0 = (Function0) this.f1080c;
                if (this.f1079b) {
                    function0.invoke();
                }
                return Unit.f26487a;
        }
    }

    public /* synthetic */ d(boolean z11, Object obj, int i11) {
        this.f1078a = i11;
        this.f1079b = z11;
        this.f1080c = obj;
    }
}
