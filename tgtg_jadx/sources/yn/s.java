package yn;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.app.tgtg.R;
import org.jetbrains.annotations.NotNull;
import pg.f3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class s extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f3 f46308a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, ViewGroup viewGroup) {
        super(context);
        viewGroup.getClass();
        View viewInflate = LayoutInflater.from(context).inflate(R.layout.regret_invitation_success_snackbar, viewGroup, false);
        viewGroup.addView(viewInflate);
        ComposeView composeView = (ComposeView) pd.g.t(R.id.snackBarView, viewInflate);
        if (composeView != null) {
            this.f46308a = new f3((ConstraintLayout) viewInflate, composeView);
        } else {
            c50.w.l("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.snackBarView)));
            throw null;
        }
    }

    @NotNull
    public final f3 getBinding() {
        return this.f46308a;
    }
}
