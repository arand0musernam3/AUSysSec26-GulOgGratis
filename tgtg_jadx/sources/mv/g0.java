package mv;

import android.content.Context;
import android.text.style.URLSpan;
import android.view.View;
import android.widget.Toast;
import com.app.tgtg.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class g0 extends URLSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f30187b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(Context context, Function0 function0, String str) {
        super(str);
        context.getClass();
        str.getClass();
        this.f30186a = context;
        this.f30187b = function0;
    }

    @Override // android.text.style.URLSpan, android.text.style.ClickableSpan
    public final void onClick(View view) {
        view.getClass();
        Context context = this.f30186a;
        if (r0.u(context)) {
            this.f30187b.invoke();
        } else {
            Toast.makeText(context, context.getString(R.string.generic_error_unable_to_connect_to_internet_please_try_again_later), 0).show();
        }
    }
}
