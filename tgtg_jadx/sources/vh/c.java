package vh;

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
import com.google.android.material.bottomsheet.l;
import com.google.android.material.bottomsheet.m;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import rk.a0;
import uh.g;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lvh/c;", "Lcom/google/android/material/bottomsheet/m;", "<init>", "()V", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCateringAllergensBottomSheet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CateringAllergensBottomSheet.kt\ncom/app/tgtg/feature/catering/ui/composables/CateringAllergensBottomSheet\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,81:1\n172#2,9:82\n1128#3,6:91\n1128#3,6:97\n1128#3,6:103\n*S KotlinDebug\n*F\n+ 1 CateringAllergensBottomSheet.kt\ncom/app/tgtg/feature/catering/ui/composables/CateringAllergensBottomSheet\n*L\n21#1:82,9\n46#1:91,6\n50#1:97,6\n57#1:103,6\n*E\n"})
public final class c extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f42327a = new n1(Reflection.getOrCreateKotlinClass(g.class), new b(this, 0), new b(this, 2), new b(this, 1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public uh.a f42328b;

    @Override // com.google.android.material.bottomsheet.m, k.z, androidx.fragment.app.y
    public final Dialog onCreateDialog(Bundle bundle) {
        l lVar = new l(requireContext(), getTheme());
        lVar.getBehavior().J(4);
        lVar.getBehavior().I(-1);
        return lVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Parcelable parcelable = requireArguments().getParcelable("item");
        parcelable.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(r3.f7360a);
        composeView.setContent(new u3.d(new a0(13, this, (BasicItem) parcelable), true, -1637855487));
        return composeView;
    }
}
