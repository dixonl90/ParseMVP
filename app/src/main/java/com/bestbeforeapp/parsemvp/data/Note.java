/*
 * Copyright 2015, The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.bestbeforeapp.parsemvp.data;

import android.support.annotation.Nullable;
import com.google.common.base.Objects;
import com.parse.ParseClassName;
import com.parse.ParseObject;
import java.util.UUID;

/**
 * Immutable model class for a Note.
 */
@ParseClassName("Note")
public final class Note extends ParseObject {

    private static final String TITLE = "title";
    private static final String DESCRIPTION = "description";

    public Note() {

    }

    public Note(@Nullable String title, @Nullable String description) {
        put(TITLE, title);
        put(DESCRIPTION, description);
    }

    public String getId() {
        return getObjectId();
    }

    @Nullable
    public String getTitle() {
        return getString(TITLE);
    }

    @Nullable
    public String getDescription() {
        return getString(DESCRIPTION);
    }

    public boolean isEmpty() {
        return (getString(TITLE) == null || "".equals(getString(TITLE))) &&
                (getString(DESCRIPTION) == null || "".equals(getString(DESCRIPTION)));
    }
}
