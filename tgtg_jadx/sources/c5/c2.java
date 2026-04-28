package c5;

import androidx.savedstate.SavedStateRegistry;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f7148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SavedStateRegistry f7149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7150c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(boolean z11, SavedStateRegistry savedStateRegistry, String str) {
        super(0);
        this.f7148a = z11;
        this.f7149b = savedStateRegistry;
        this.f7150c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if (this.f7148a) {
            SavedStateRegistry savedStateRegistry = this.f7149b;
            String str = this.f7150c;
            ga.a aVar = savedStateRegistry.f4003a;
            synchronized (aVar.f20265c) {
            }
        }
        return Unit.f26487a;
    }
}
