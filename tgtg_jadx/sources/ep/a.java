package ep;

import com.app.tgtg.feature.recipegenerator.RecipeGeneratorActivity;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RecipeGeneratorActivity f16215b;

    public /* synthetic */ a(RecipeGeneratorActivity recipeGeneratorActivity, int i11) {
        this.f16214a = i11;
        this.f16215b = recipeGeneratorActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f16214a) {
            case 0:
                return this.f16215b.getDefaultViewModelProviderFactory();
            case 1:
                return this.f16215b.getViewModelStore();
            default:
                return this.f16215b.getDefaultViewModelCreationExtras();
        }
    }
}
