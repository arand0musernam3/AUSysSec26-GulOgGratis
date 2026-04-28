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
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.google.android.material.bottomsheet.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import qk.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsk/b;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nItemAllergensBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemAllergensBottomSheet.kt\ncom/app/tgtg/feature/itemview/ui/components/bottomsheet/ItemAllergensBottomSheet\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,87:1\n172#2,9:88\n1#3:97\n1128#4,6:98\n1128#4,6:104\n1128#4,6:110\n*S KotlinDebug\n*F\n+ 1 ItemAllergensBottomSheet.kt\ncom/app/tgtg/feature/itemview/ui/components/bottomsheet/ItemAllergensBottomSheet\n*L\n21#1:88,9\n65#1:98,6\n74#1:104,6\n79#1:110,6\n*E\n"})
public final class b extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f39045a = new n1(Reflection.getOrCreateKotlinClass(l.class), new a(this, 0), new a(this, 2), new a(this, 1));

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
        Parcelable parcelable = requireArguments().getParcelable("item");
        parcelable.getClass();
        String string = requireArguments().getString("fillerType");
        String string2 = requireArguments().getString("voucherId");
        boolean z11 = requireArguments().getBoolean("preselectedCurrencyVoucher", false);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(r3.f7360a);
        composeView.setContent(new u3.d(new bg.d(this, (BasicItem) parcelable, string, string2, z11), true, 1795708642));
        return composeView;
    }
}
