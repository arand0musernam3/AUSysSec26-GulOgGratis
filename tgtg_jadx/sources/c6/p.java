package c6;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import androidx.compose.ui.node.Owner;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f7749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f7750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m3.x f7751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y3.e f7752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ View f7754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, Function1 function1, m3.q qVar, y3.e eVar, int i11, View view) {
        super(0);
        this.f7749a = context;
        this.f7750b = function1;
        this.f7751c = qVar;
        this.f7752d = eVar;
        this.f7753e = i11;
        this.f7754f = view;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        KeyEvent.Callback callback = this.f7754f;
        callback.getClass();
        return new d0(this.f7749a, this.f7750b, this.f7751c, this.f7752d, this.f7753e, (Owner) callback).getLayoutNode();
    }
}
