package bm;

import android.content.Context;
import android.widget.Toast;
import com.app.tgtg.R;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements y80.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f6373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f6374c;

    public /* synthetic */ m(Function1 function1, Context context, int i11) {
        this.f6372a = i11;
        this.f6373b = function1;
        this.f6374c = context;
    }

    @Override // y80.j
    public final Object emit(Object obj, x70.c cVar) {
        int i11 = this.f6372a;
        Context context = this.f6374c;
        Function1 function1 = this.f6373b;
        switch (i11) {
            case 0:
                i iVar = (i) obj;
                if (iVar instanceof h) {
                    function1.invoke(((h) iVar).f6361a);
                } else if (!(iVar instanceof g)) {
                    e40.a.f();
                } else {
                    Toast.makeText(context, context.getString(R.string.generic_err_undefined_error), 0).show();
                }
                break;
            default:
                yl.d dVar = (yl.d) obj;
                if (dVar instanceof yl.c) {
                    function1.invoke(((yl.c) dVar).f46143a);
                } else if (!(dVar instanceof yl.b)) {
                    e40.a.f();
                } else {
                    Toast.makeText(context, context.getString(R.string.login_charity_error_generic), 0).show();
                }
                break;
        }
        return null;
    }
}
