package zendesk.messaging.android.internal;

import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.fragment.app.g1;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.h;
import e0.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.c0;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yj.l;
import yl.e;
import zendesk.logger.Logger;
import zendesk.messaging.android.internal.model.UploadFile;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 ?2\u00020\u0001:\u0001?BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b \u0010!J+\u0010$\u001a\u00020\t2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u0007H\u0002¢\u0006\u0004\b$\u0010%J%\u0010)\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b+\u0010\u0016J)\u0010-\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b-\u0010.J/\u00100\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0018\u0010/\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0007\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b0\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R&\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00103R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00104R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00105R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00106R\u001c\u00108\u001a\b\u0012\u0004\u0012\u00020\b078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R$\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00103R\u0018\u0010;\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020&078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u00109R*\u0010>\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u00103¨\u0006@"}, d2 = {"Lzendesk/messaging/android/internal/AttachmentIntentsLauncher;", "Landroidx/lifecycle/h;", "Landroidx/activity/result/ActivityResultRegistry;", "registry", "Lzendesk/messaging/android/internal/AttachmentFileResolver;", "fileResolver", "Lkotlin/Function1;", "", "Landroid/net/Uri;", "", "onSaveListOfUris", "Lkotlin/Function0;", "onRestoreUrisToUploadFiles", "Landroid/content/Context;", "context", "", "uuid", "<init>", "(Landroidx/activity/result/ActivityResultRegistry;Lzendesk/messaging/android/internal/AttachmentFileResolver;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroid/content/Context;Ljava/lang/String;)V", "Landroidx/lifecycle/LifecycleOwner;", "owner", "setupCameraLauncher", "(Landroidx/lifecycle/LifecycleOwner;)V", "setupGalleryLauncher", "uri", "handleSingleFileSelection", "(Landroid/net/Uri;)V", "Landroid/content/ClipData;", "clipData", "handleMultipleFileSelection", "(Landroid/content/ClipData;)V", "Lzendesk/messaging/android/internal/model/UploadFile;", "createListOfUploadFileForSelectedFiles", "(Landroid/content/ClipData;)Ljava/util/List;", "uris", "files", "handleDocumentSelection", "(Ljava/util/List;Ljava/util/List;)V", "Landroid/content/Intent;", "intent", "action", "resolveActivity", "(Landroid/content/Intent;Lkotlin/jvm/functions/Function0;)V", "onCreate", "onPhotoCapturedResult", "launchCamera", "(Landroid/content/Intent;Lkotlin/jvm/functions/Function1;)V", "onDocumentSelectedResult", "launchGallery", "Landroidx/activity/result/ActivityResultRegistry;", "Lzendesk/messaging/android/internal/AttachmentFileResolver;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Landroid/content/Context;", "Ljava/lang/String;", "Landroidx/activity/result/ActivityResultLauncher;", "cameraLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "photoCapturedResultCallback", "temporaryPhotoUri", "Landroid/net/Uri;", "galleryLauncher", "documentSelectedResultCallback", "Companion", "zendesk.messaging_messaging-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAttachmentIntentsLauncher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttachmentIntentsLauncher.kt\nzendesk/messaging/android/internal/AttachmentIntentsLauncher\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,215:1\n1563#2:216\n1634#2,2:217\n1636#2:220\n29#3:219\n*S KotlinDebug\n*F\n+ 1 AttachmentIntentsLauncher.kt\nzendesk/messaging/android/internal/AttachmentIntentsLauncher\n*L\n149#1:216\n149#1:217,2\n149#1:220\n149#1:219\n*E\n"})
public final class AttachmentIntentsLauncher implements h {

    @NotNull
    private static final String DOCUMENT_PICKER_KEY = "DOCUMENT_PICKER_KEY";

    @NotNull
    private static final String LOG_TAG = "AttachmentIntentsLauncher";

    @NotNull
    private static final String TAKE_PICTURE_KEY = "TAKE_PICTURE_KEY";
    private ActivityResultLauncher<Uri> cameraLauncher;

    @NotNull
    private final Context context;

    @Nullable
    private Function1<? super List<UploadFile>, Unit> documentSelectedResultCallback;

    @NotNull
    private final AttachmentFileResolver fileResolver;
    private ActivityResultLauncher<Intent> galleryLauncher;

    @NotNull
    private final Function0<Unit> onRestoreUrisToUploadFiles;

    @NotNull
    private final Function1<List<? extends Uri>, Unit> onSaveListOfUris;

    @Nullable
    private Function1<? super UploadFile, Unit> photoCapturedResultCallback;

    @NotNull
    private final ActivityResultRegistry registry;

    @Nullable
    private Uri temporaryPhotoUri;

    @NotNull
    private final String uuid;

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentIntentsLauncher(@NotNull ActivityResultRegistry activityResultRegistry, @NotNull AttachmentFileResolver attachmentFileResolver, @NotNull Function1<? super List<? extends Uri>, Unit> function1, @NotNull Function0<Unit> function0, @NotNull Context context, @NotNull String str) {
        activityResultRegistry.getClass();
        attachmentFileResolver.getClass();
        function1.getClass();
        function0.getClass();
        context.getClass();
        str.getClass();
        this.registry = activityResultRegistry;
        this.fileResolver = attachmentFileResolver;
        this.onSaveListOfUris = function1;
        this.onRestoreUrisToUploadFiles = function0;
        this.context = context;
        this.uuid = str;
    }

    private final List<UploadFile> createListOfUploadFileForSelectedFiles(ClipData clipData) {
        int itemCount = clipData.getItemCount();
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < itemCount; i11++) {
            Uri uri = clipData.getItemAt(i11).getUri();
            AttachmentFileResolver attachmentFileResolver = this.fileResolver;
            Context context = this.context;
            uri.getClass();
            attachmentFileResolver.grantPersistentMediaAccess(context, uri);
            arrayList.add(this.fileResolver.createUploadFileFromUri(this.context, uri));
        }
        return arrayList;
    }

    private final void handleDocumentSelection(List<? extends Uri> uris, List<UploadFile> files) {
        this.onSaveListOfUris.invoke(uris);
        Function1<? super List<UploadFile>, Unit> function1 = this.documentSelectedResultCallback;
        if (function1 != null) {
            function1.invoke(files);
        } else {
            this.onRestoreUrisToUploadFiles.invoke();
        }
    }

    private final void handleMultipleFileSelection(ClipData clipData) {
        List<UploadFile> listCreateListOfUploadFileForSelectedFiles = createListOfUploadFileForSelectedFiles(clipData);
        ArrayList arrayList = new ArrayList(e0.o(listCreateListOfUploadFileForSelectedFiles, 10));
        Iterator<T> it = listCreateListOfUploadFileForSelectedFiles.iterator();
        while (it.hasNext()) {
            arrayList.add(Uri.parse(((UploadFile) it.next()).getUri()));
        }
        handleDocumentSelection(arrayList, listCreateListOfUploadFileForSelectedFiles);
    }

    private final void handleSingleFileSelection(Uri uri) {
        handleDocumentSelection(c0.c(uri), c0.c(this.fileResolver.createUploadFileFromUri(this.context, uri)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchCamera$lambda$4(AttachmentIntentsLauncher attachmentIntentsLauncher, Function1 function1) {
        Uri uriCreateUriToCapturePhoto = attachmentIntentsLauncher.fileResolver.createUriToCapturePhoto(attachmentIntentsLauncher.context);
        if (uriCreateUriToCapturePhoto != null) {
            attachmentIntentsLauncher.temporaryPhotoUri = uriCreateUriToCapturePhoto;
            attachmentIntentsLauncher.onSaveListOfUris.invoke(c0.c(uriCreateUriToCapturePhoto));
            ActivityResultLauncher<Uri> activityResultLauncher = attachmentIntentsLauncher.cameraLauncher;
            if (activityResultLauncher == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cameraLauncher");
                activityResultLauncher = null;
            }
            activityResultLauncher.a(uriCreateUriToCapturePhoto, null);
            attachmentIntentsLauncher.photoCapturedResultCallback = function1;
        }
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit launchGallery$lambda$6(AttachmentIntentsLauncher attachmentIntentsLauncher, Intent intent, Function1 function1) {
        ActivityResultLauncher<Intent> activityResultLauncher = attachmentIntentsLauncher.galleryLauncher;
        if (activityResultLauncher == null) {
            Intrinsics.throwUninitializedPropertyAccessException("galleryLauncher");
            activityResultLauncher = null;
        }
        activityResultLauncher.a(intent, null);
        attachmentIntentsLauncher.documentSelectedResultCallback = function1;
        return Unit.f26487a;
    }

    private final void resolveActivity(Intent intent, Function0<Unit> action) {
        if (intent.resolveActivity(this.context.getPackageManager()) != null) {
            action.invoke();
        } else {
            Logger.e(LOG_TAG, f.k("Unable to find activity to launch the ", intent.getAction()), new Object[0]);
        }
    }

    private final void setupCameraLauncher(LifecycleOwner owner) {
        this.cameraLauncher = this.registry.d(f.k("TAKE_PICTURE_KEY_", this.uuid), owner, new g1(6), new a(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupCameraLauncher$lambda$1(AttachmentIntentsLauncher attachmentIntentsLauncher, boolean z11) {
        if (z11) {
            Uri uri = attachmentIntentsLauncher.temporaryPhotoUri;
            if (uri == null) {
                attachmentIntentsLauncher.onRestoreUrisToUploadFiles.invoke();
                return;
            }
            UploadFile uploadFileCreateUploadFileFromUri = attachmentIntentsLauncher.fileResolver.createUploadFileFromUri(attachmentIntentsLauncher.context, uri);
            Function1<? super UploadFile, Unit> function1 = attachmentIntentsLauncher.photoCapturedResultCallback;
            if (function1 != null) {
                function1.invoke(uploadFileCreateUploadFileFromUri);
            }
            attachmentIntentsLauncher.photoCapturedResultCallback = null;
        }
    }

    private final void setupGalleryLauncher(LifecycleOwner owner) {
        this.galleryLauncher = this.registry.d(f.k("DOCUMENT_PICKER_KEY_", this.uuid), owner, new g1(4), new a(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupGalleryLauncher$lambda$5(AttachmentIntentsLauncher attachmentIntentsLauncher, h.a aVar) {
        aVar.getClass();
        int i11 = aVar.f20935a;
        Intent intent = aVar.f20936b;
        if (i11 == -1) {
            Uri data = intent != null ? intent.getData() : null;
            ClipData clipData = intent != null ? intent.getClipData() : null;
            if (data != null) {
                attachmentIntentsLauncher.handleSingleFileSelection(data);
            } else if (clipData != null) {
                attachmentIntentsLauncher.handleMultipleFileSelection(clipData);
            }
        }
    }

    public final void launchCamera(@NotNull Intent intent, @NotNull Function1<? super UploadFile, Unit> onPhotoCapturedResult) {
        intent.getClass();
        onPhotoCapturedResult.getClass();
        resolveActivity(intent, new e(this, onPhotoCapturedResult));
    }

    public final void launchGallery(@NotNull Intent intent, @NotNull Function1<? super List<UploadFile>, Unit> onDocumentSelectedResult) {
        intent.getClass();
        onDocumentSelectedResult.getClass();
        resolveActivity(intent, new l(this, intent, onDocumentSelectedResult, 5));
    }

    @Override // androidx.lifecycle.h
    public void onCreate(@NotNull LifecycleOwner owner) {
        owner.getClass();
        owner.getClass();
        setupCameraLauncher(owner);
        setupGalleryLauncher(owner);
    }

    @Override // androidx.lifecycle.h
    public void onDestroy(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.h
    public void onPause(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.h
    public void onResume(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.h
    public void onStart(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    @Override // androidx.lifecycle.h
    public void onStop(@NotNull LifecycleOwner lifecycleOwner) {
        lifecycleOwner.getClass();
    }

    public /* synthetic */ AttachmentIntentsLauncher(ActivityResultRegistry activityResultRegistry, AttachmentFileResolver attachmentFileResolver, Function1 function1, Function0 function0, Context context, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(activityResultRegistry, attachmentFileResolver, function1, function0, context, (i11 & 32) != 0 ? UUID.randomUUID().toString() : str);
    }
}
