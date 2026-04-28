package uo;

import com.app.tgtg.feature.postpurchase.notification.AddReminderFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends Lambda implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddReminderFragment f41470b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(AddReminderFragment addReminderFragment, int i11) {
        super(0);
        this.f41469a = i11;
        this.f41470b = addReminderFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41469a) {
            case 0:
                return this.f41470b.requireActivity().getViewModelStore();
            case 1:
                return this.f41470b.requireActivity().getDefaultViewModelCreationExtras();
            case 2:
                return this.f41470b.requireActivity().getDefaultViewModelProviderFactory();
            default:
                return this.f41470b;
        }
    }
}
