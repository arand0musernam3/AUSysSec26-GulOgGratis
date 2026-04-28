package cy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.o0;
import com.facebook.FacebookDialogException;
import tx.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends u0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f13528o = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f13529n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(o0 o0Var, String str, String str2) {
        super(o0Var, str);
        o0Var.getClass();
        str.getClass();
        str2.getClass();
        this.f13529n = str2;
        this.f40559b = str2;
    }

    @Override // tx.u0
    public final Bundle c(String str) {
        String str2 = this.f13529n;
        if (str2.length() <= 0 || !kotlin.text.y.p(str, str2, false)) {
            return super.c(str);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            dismiss();
        } catch (Exception e5) {
            e(new FacebookDialogException(r8.k.j(e5, new StringBuilder("Failed to launch custom redirect: ")), -1, str));
        }
        return new Bundle();
    }
}
