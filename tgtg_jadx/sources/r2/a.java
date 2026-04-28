package r2;

import a3.v0;
import android.os.Handler;
import android.os.Looper;
import android.view.ActionMode;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f37538b;

    public /* synthetic */ a(f fVar, int i11) {
        this.f37537a = i11;
        this.f37538b = fVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f37537a) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = this.f37538b.f37550a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new b4.b(7, function0));
                    }
                }
                return Unit.f26487a;
            case 1:
                ActionMode actionMode = this.f37538b.f37557h;
                if (actionMode != null) {
                    actionMode.invalidate();
                }
                return Unit.f26487a;
            case 2:
                ActionMode actionMode2 = this.f37538b.f37557h;
                if (actionMode2 != null) {
                    actionMode2.invalidateContentRect();
                }
                return Unit.f26487a;
            default:
                f fVar = this.f37538b;
                fVar.f37554e.e();
                return new v0(fVar, 15);
        }
    }
}
