package sr;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;
import com.app.tgtg.feature.tabprofile.manageaccount.contactus.ContactUsActivity;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends ConstraintLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pg.v f39108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactUsActivity f39109b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ContactUsActivity contactUsActivity, Context context) {
        super(context);
        context.getClass();
        this.f39109b = contactUsActivity;
        int i11 = 0;
        View viewInflate = contactUsActivity.getLayoutInflater().inflate(R.layout.contact_us_text_item, (ViewGroup) this, false);
        addView(viewInflate);
        if (viewInflate == null) {
            c50.w.l("rootView");
            throw null;
        }
        TextView textView = (TextView) viewInflate;
        this.f39108a = new pg.v(textView, textView, i11);
    }
}
