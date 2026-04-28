package zendesk.android;

import com.adyen.checkout.components.core.internal.util.StatusResponseUtils;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lzendesk/android/ZendeskAuthenticationDelegate;", "", "", StatusResponseUtils.RESULT_ERROR, "Lkotlin/Function1;", "", "", "updateToken", "onInvalidAuth", "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ZendeskAuthenticationDelegate {
    void onInvalidAuth(@Nullable Throwable error, @NotNull Function1<? super String, Unit> updateToken);
}
