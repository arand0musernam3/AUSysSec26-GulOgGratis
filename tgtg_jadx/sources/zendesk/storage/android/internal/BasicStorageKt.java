package zendesk.storage.android.internal;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroid/content/SharedPreferences;", "Lkotlin/Function1;", "Landroid/content/SharedPreferences$Editor;", "", "block", "edit", "(Landroid/content/SharedPreferences;Lkotlin/jvm/functions/Function1;)V", "zendesk.storage_storage-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class BasicStorageKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void edit(SharedPreferences sharedPreferences, Function1<? super SharedPreferences.Editor, Unit> function1) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        function1.invoke(editorEdit);
        editorEdit.apply();
    }
}
