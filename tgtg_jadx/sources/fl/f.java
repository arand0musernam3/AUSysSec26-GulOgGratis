package fl;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.util.Consumer;
import com.app.tgtg.R;
import com.app.tgtg.customview.manufactureaddressfragment.XmlCheckoutAddressFragment;
import com.app.tgtg.feature.login.email.EmailCodeAccessActivity;
import com.google.android.material.search.SearchView;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17784b;

    public /* synthetic */ f(Object obj, int i11) {
        this.f17783a = i11;
        this.f17784b = obj;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i11 = this.f17783a;
        Object obj = this.f17784b;
        switch (i11) {
            case 0:
                EmailCodeAccessActivity emailCodeAccessActivity = (EmailCodeAccessActivity) obj;
                if (editable != null) {
                    pg.b bVar = emailCodeAccessActivity.f9050g;
                    bVar.getClass();
                    ((TextView) bVar.f34785f).setVisibility(8);
                    pg.b bVar2 = emailCodeAccessActivity.f9050g;
                    bVar2.getClass();
                    ((ImageView) bVar2.f34784e).setVisibility(8);
                    pg.b bVar3 = emailCodeAccessActivity.f9050g;
                    bVar3.getClass();
                    ((TextInputEditText) bVar3.f34786g).setBackground(emailCodeAccessActivity.getDrawable(R.drawable.signup_input_text_field));
                }
                break;
            case 1:
                ((XmlCheckoutAddressFragment) obj).I();
                break;
            case 3:
                editable.getClass();
                ((Consumer) obj).accept(editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        switch (this.f17783a) {
            case 3:
                charSequence.getClass();
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i11, int i12, int i13) {
        switch (this.f17783a) {
            case 0:
            case 1:
                break;
            case 2:
                ((SearchView) this.f17784b).l.setVisibility(charSequence.length() > 0 ? 0 : 8);
                break;
            case 3:
                charSequence.getClass();
                break;
            default:
                androidx.appcompat.widget.SearchView searchView = (androidx.appcompat.widget.SearchView) this.f17784b;
                Editable text = searchView.f2058p.getText();
                searchView.t0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.v(!zIsEmpty);
                int i14 = 8;
                if (searchView.f2052h0 && !searchView.N && zIsEmpty) {
                    searchView.f2063u.setVisibility(8);
                    i14 = 0;
                }
                searchView.f2065w.setVisibility(i14);
                searchView.r();
                searchView.u();
                charSequence.toString();
                break;
        }
    }

    private final void a(Editable editable) {
    }

    private final void b(Editable editable) {
    }

    private final void c(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void d(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void e(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void f(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void g(int i11, int i12, int i13, CharSequence charSequence) {
    }

    private final void h(int i11, int i12, int i13, CharSequence charSequence) {
    }
}
