package zendesk.ui.android.conversation.bottomsheet;

import android.view.View;
import androidx.fragment.app.o0;
import com.app.tgtg.feature.tabprofile.storelogin.ui.RecommendStoreSuccessFragment;
import kotlin.jvm.functions.Function0;
import mv.a0;
import mv.z;
import zendesk.ui.android.conversations.cell.ConversationCellState;
import zendesk.ui.android.conversations.cell.ConversationCellView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f47810b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f47809a = i11;
        this.f47810b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f47809a) {
            case 0:
                BottomSheetView.render$lambda$3$lambda$1((BottomSheetView) this.f47810b, view);
                break;
            case 1:
                ((Function0) this.f47810b).invoke();
                break;
            case 2:
                ConversationCellView.onBind$lambda$0((ConversationCellState) this.f47810b, view);
                break;
            default:
                RecommendStoreSuccessFragment recommendStoreSuccessFragment = (RecommendStoreSuccessFragment) this.f47810b;
                a0 a0Var = new a0();
                z zVar = z.DISCOVER;
                zVar.getClass();
                a0Var.f30138a = zVar;
                a0Var.f30144g = true;
                o0 o0VarRequireActivity = recommendStoreSuccessFragment.requireActivity();
                o0VarRequireActivity.getClass();
                a0Var.c(o0VarRequireActivity);
                break;
        }
    }
}
