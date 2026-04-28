package sk;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.n1;
import c5.r3;
import com.app.tgtg.model.remote.ItemId;
import com.google.android.material.bottomsheet.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import qk.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsk/d;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nItemCustomReminderBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemCustomReminderBottomSheet.kt\ncom/app/tgtg/feature/itemview/ui/components/bottomsheet/ItemCustomReminderBottomSheet\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,82:1\n172#2,9:83\n1128#3,6:92\n1128#3,6:98\n1128#3,6:104\n*S KotlinDebug\n*F\n+ 1 ItemCustomReminderBottomSheet.kt\ncom/app/tgtg/feature/itemview/ui/components/bottomsheet/ItemCustomReminderBottomSheet\n*L\n21#1:83,9\n63#1:92,6\n64#1:98,6\n73#1:104,6\n*E\n"})
public final class d extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f39048a = new n1(Reflection.getOrCreateKotlinClass(l.class), new c(this, 0), new c(this, 2), new c(this, 1));

    @Override // com.google.android.material.bottomsheet.m, k.z, androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        com.google.android.material.bottomsheet.l lVar = new com.google.android.material.bottomsheet.l(requireContext(), getTheme());
        lVar.getBehavior().J(4);
        lVar.getBehavior().I(-1);
        return lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Parcelable parcelable = requireArguments().getParcelable("item_id");
        parcelable.getClass();
        String strM205unboximpl = ((ItemId) parcelable).m205unboximpl();
        boolean z11 = requireArguments().getBoolean("is_item_subscribed");
        Parcelable parcelable2 = requireArguments().getParcelable("reminder_details");
        parcelable2.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(r3.f7360a);
        composeView.setContent(new u3.d(new cg.c(z11, (vj.c) parcelable2, this, strM205unboximpl), true, -733881730));
        return composeView;
    }
}
