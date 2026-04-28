package ax;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.PopupWindow;
import com.adyen.checkout.card.internal.ui.view.CardScanningFragment;
import com.adyen.checkout.card.internal.ui.view.CardView;
import com.adyen.checkout.components.core.internal.ui.ActionDelegate;
import com.adyen.checkout.ui.core.internal.ui.ButtonDelegate;
import com.adyen.checkout.ui.core.internal.ui.view.PaymentInProgressView;
import com.app.tgtg.customview.DiscoverLocationView;
import com.app.tgtg.customview.ExpandableTextView;
import com.app.tgtg.feature.flashsales.list.FlashSalesListActivity;
import com.app.tgtg.feature.locationpicker.LocationPickerActivity;
import com.app.tgtg.feature.main.MainActivity;
import com.app.tgtg.feature.tabprofile.impact.orderList.OrderListActivity;
import com.app.tgtg.feature.tabprofile.manageaccount.hiddenstores.ui.HiddenStoresActivity;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.braze.ui.inappmessage.DefaultInAppMessageViewWrapper;
import com.braze.ui.inappmessage.factories.DefaultInAppMessageModalViewFactory;
import com.braze.ui.inappmessage.views.InAppMessageModalView;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.install.InstallException;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.bouncycastle.iana.AEADAlgorithm;
import tx.u0;
import zendesk.ui.android.common.loadmore.LoadMoreView;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class s implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4997b;

    public /* synthetic */ s(Object obj, int i11) {
        this.f4996a = i11;
        this.f4997b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i11 = this.f4996a;
        int i12 = 0;
        Object obj = this.f4997b;
        switch (i11) {
            case 0:
                LoginButton loginButton = (LoginButton) obj;
                Set set = yx.a.f46339a;
                if (set.contains(t.class)) {
                    return;
                }
                try {
                    Context context = loginButton.getContext();
                    if (!set.contains(loginButton)) {
                        try {
                            bx.m mVar = new bx.m(context, (String) null);
                            String str = loginButton.f5008b;
                            a0 a0Var = a0.f4849a;
                            if (s0.c()) {
                                mVar.g(null, str);
                            }
                        } catch (Throwable th2) {
                            yx.a.a(loginButton, th2);
                        }
                        break;
                    }
                    View.OnClickListener onClickListener = loginButton.f5010d;
                    if (onClickListener != null) {
                        onClickListener.onClick(view);
                        return;
                    }
                    View.OnClickListener onClickListener2 = loginButton.f5009c;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                        return;
                    }
                    return;
                } catch (Throwable th3) {
                    yx.a.a(t.class, th3);
                    return;
                }
            case 1:
                Function0 function0 = ((DiscoverLocationView) obj).f8891c;
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
            case 2:
                int i13 = ExpandableTextView.f8892m;
                ((ExpandableTextView) obj).e();
                return;
            case 3:
                bg.g0 g0Var = (bg.g0) obj;
                if (g0Var.getDialog() != null) {
                    Dialog dialog = g0Var.getDialog();
                    dialog.getClass();
                    dialog.dismiss();
                    return;
                }
                return;
            case 4:
                ((PopupWindow) obj).dismiss();
                return;
            case 5:
                ((bl.a) obj).dismiss();
                return;
            case 6:
                int i14 = OrderListActivity.l;
                ((OrderListActivity) obj).getOnBackPressedDispatcher().d();
                return;
            case 7:
                int i15 = HiddenStoresActivity.f9412k;
                u70.t tVar = ((HiddenStoresActivity) obj).A().f6697c;
                Integer num = (Integer) ((androidx.lifecycle.o0) tVar.getValue()).d();
                if (num != null && num.intValue() == 0) {
                    ((androidx.lifecycle.o0) tVar.getValue()).k(1);
                    return;
                } else {
                    ((androidx.lifecycle.o0) tVar.getValue()).k(0);
                    return;
                }
            case 8:
                CardScanningFragment.onViewCreated$lambda$1((CardScanningFragment) obj, view);
                return;
            case 9:
                CardView.initAddressLookup$lambda$24((CardView) obj, view);
                return;
            case 10:
                ((ButtonDelegate) obj).onSubmit();
                return;
            case 11:
                PaymentInProgressView.initView$lambda$1((ActionDelegate) obj, view);
                return;
            case 12:
                DefaultInAppMessageViewWrapper.createClickListener$lambda$16((DefaultInAppMessageViewWrapper) obj, view);
                return;
            case 13:
                InAppMessageModalView.resetMessageMargins$lambda$1((InAppMessageModalView) obj, view);
                return;
            case 14:
                ((cy.k) obj).r();
                return;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                int i16 = FlashSalesListActivity.f8995p;
                ((FlashSalesListActivity) obj).getOnBackPressedDispatcher().d();
                return;
            case 16:
                dy.j jVar = (dy.j) obj;
                if (yx.a.f46339a.contains(dy.j.class)) {
                    return;
                }
                try {
                    jVar.h();
                    return;
                } catch (Throwable th4) {
                    yx.a.a(dy.j.class, th4);
                    return;
                }
            case 17:
                boolean z11 = MainActivity.f9078v;
                z20.e eVarH0 = ((MainActivity) obj).h0();
                z20.j jVar2 = eVarH0.f46947a;
                String packageName = eVarH0.f46949c.getPackageName();
                a30.p pVar = jVar2.f46960a;
                if (pVar != null) {
                    z20.j.f46958e.d("completeUpdate(%s)", packageName);
                    d10.g gVar = new d10.g();
                    pVar.a().post(new z20.f(pVar, gVar, gVar, new z20.f(jVar2, gVar, gVar, packageName, 1), 2));
                    return;
                } else {
                    a30.j jVar3 = z20.j.f46958e;
                    Object[] objArr = {-9};
                    jVar3.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        Log.e("PlayCore", a30.j.e(jVar3.f657a, "onError(%d)", objArr));
                    }
                    Tasks.c(new InstallException(-9));
                    return;
                }
            case 18:
                lm.i iVar = (lm.i) obj;
                bg.s0 s0Var = new bg.s0();
                s0Var.l = new lm.c(iVar, i12);
                s0Var.show(iVar.getParentFragmentManager(), "SortByBottomSheetFragment");
                iVar.s().f40307b.b(cv.i.ACTION_LIST_SORTBY_TAPPED);
                return;
            case 19:
                j30.g gVar2 = (j30.g) obj;
                ((nm.e) ((mm.b) gVar2.f24504d)).v((BasicItem) gVar2.f24502b);
                return;
            case 20:
                j30.g gVar3 = (j30.g) obj;
                ((nm.e) ((mm.b) gVar3.f24504d)).v((BasicItem) gVar3.f24502b);
                return;
            case 21:
                t20.c cVar = (t20.c) obj;
                EditText editText = cVar.f39675i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                cVar.p();
                return;
            case 22:
                ((t20.i) obj).t();
                return;
            case 23:
                t20.r rVar = (t20.r) obj;
                EditText editText2 = rVar.f39759f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = rVar.f39759f;
                boolean z12 = editText3 != null && (editText3.getTransformationMethod() instanceof PasswordTransformationMethod);
                EditText editText4 = rVar.f39759f;
                if (z12) {
                    editText4.setTransformationMethod(null);
                } else {
                    editText4.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    rVar.f39759f.setSelection(selectionEnd);
                }
                rVar.p();
                return;
            case 24:
                ((u0) obj).cancel();
                return;
            case 25:
                int i17 = uk.q.f41347y;
                ((k.f) obj).dismiss();
                return;
            case 26:
                LocationPickerActivity locationPickerActivity = ((uk.q) obj).f41355h;
                if (locationPickerActivity.isTaskRoot()) {
                    new mv.a0().c(locationPickerActivity);
                    return;
                } else {
                    locationPickerActivity.getOnBackPressedDispatcher().d();
                    return;
                }
            case 27:
                ((x10.j) obj).p();
                throw null;
            case 28:
                DefaultInAppMessageModalViewFactory.createInAppMessageView$lambda$2((DefaultInAppMessageModalViewFactory) obj, view);
                return;
            default:
                LoadMoreView.render$lambda$3((LoadMoreView) obj, view);
                return;
        }
    }
}
