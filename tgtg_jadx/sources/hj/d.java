package hj;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.y;
import androidx.lifecycle.n1;
import c5.r3;
import com.app.tgtg.R;
import g3.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u000e\u0010\u0005\u001a\u0004\u0018\u00010\u00048\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lhj/d;", "Landroidx/fragment/app/y;", "<init>", "()V", "Lcom/app/tgtg/model/remote/mapService/response/MapClustersResponse;", "mapResponse", "Lgj/c0;", "state", "app"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nComplexFiltersFullScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComplexFiltersFullScreenFragment.kt\ncom/app/tgtg/feature/complexquickfilters/filterfullscreen/ComplexFiltersFullScreenFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,60:1\n172#2,9:61\n172#2,9:70\n85#3:79\n85#3:80\n1128#4,6:81\n*S KotlinDebug\n*F\n+ 1 ComplexFiltersFullScreenFragment.kt\ncom/app/tgtg/feature/complexquickfilters/filterfullscreen/ComplexFiltersFullScreenFragment\n*L\n21#1:61,9\n22#1:70,9\n37#1:79\n38#1:80\n45#1:81,6\n*E\n"})
public final class d extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n1 f22085a = new n1(Reflection.getOrCreateKotlinClass(tm.e.class), new c(this, 0), new c(this, 2), new c(this, 1));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f22086b = new n1(Reflection.getOrCreateKotlinClass(ej.c.class), new c(this, 3), new c(this, 5), new c(this, 4));

    @Override // androidx.fragment.app.y, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, R.style.full_screen_dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setViewCompositionStrategy(r3.f7360a);
        composeView.setContent(new u3.d(new y0(this, 7), true, -1731283489));
        return composeView;
    }
}
