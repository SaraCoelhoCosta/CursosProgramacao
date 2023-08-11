import React from 'react';
import { BrowserRouter, Routes, Route } from 'react-router-dom';
import User from './pages/User';
import Profile from './pages/Profile';

export default function RoutesUser() {
    return (
        <BrowserRouter>
            <Routes>
                <Route exact path="/" element={<User />} />
                <Route path="/create" element={<Profile />} />
                <Route path="/update/:id" element={<Profile />} />
            </Routes>
        </BrowserRouter>
    );
}