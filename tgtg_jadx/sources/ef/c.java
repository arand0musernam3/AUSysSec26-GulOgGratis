package ef;

import com.amplitude.android.internal.locators.ComposeViewTargetLocator;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f15949a = new c(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        kf.b bVar = (kf.b) obj;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (u00.d.C("androidx.compose.ui.node.Owner", null) && u00.d.C("com.amplitude.android.internal.locators.ComposeViewTargetLocator", null)) {
            arrayList.add(new ComposeViewTargetLocator(bVar));
        }
        arrayList.add(new a());
        return arrayList;
    }
}
