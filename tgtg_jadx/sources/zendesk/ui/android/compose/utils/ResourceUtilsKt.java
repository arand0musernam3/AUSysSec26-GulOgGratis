package zendesk.ui.android.compose.utils;

import android.content.Context;
import c5.v0;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import org.jetbrains.annotations.Nullable;
import w6.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "id", "", "floatResources", "(ILm3/n;I)F", "zendesk.ui_ui-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResourceUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUtils.kt\nzendesk/ui/android/compose/utils/ResourceUtilsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,19:1\n75#2:20\n*S KotlinDebug\n*F\n+ 1 ResourceUtils.kt\nzendesk/ui/android/compose/utils/ResourceUtilsKt\n*L\n18#1:20\n*E\n"})
public final class ResourceUtilsKt {
    public static final float floatResources(int i11, @Nullable n nVar, int i12) {
        return j.a(((Context) ((s) nVar).j(v0.f7390b)).getResources(), i11);
    }
}
